package com.mycode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mycode.model.OurDate;

@Controller
public class DateController {
	
    private static final String DATE_FORMAT = "MM/dd/yyyy";
    
	@Value("${spring.application.date.errorMessage}")
    String errorMessage;
 
    /**
     * 
     * @param model - object of the page
     * @return - shows the result page to be redirected
     */
    @GetMapping("/dateDiff")
    public String homePage(Model model) {
        model.addAttribute("ourDate", new OurDate());
        return "date";
    }    
    
    /**
     * 
     * @param ourDate - object that is used in the page
     * @return - shows the result page to be redirected
     */
    @PostMapping("/dateDiffFinder")
    public String findDateDifference(@ModelAttribute OurDate ourDate) {
        String fromDate = ourDate.getFromDate();
        String toDate = ourDate.getToDate();   
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        final LocalDate firstDate = LocalDate.parse(fromDate, formatter);
        final LocalDate secondDate = LocalDate.parse(toDate, formatter);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        
        if(days < 0) {
        	ourDate.setErrorMessage(errorMessage);
        	ourDate.setDateDifference(0);
        }else {
        	ourDate.setDateDifference(days);
        	ourDate.setErrorMessage("");
        }
        return "result";
    }
    
    
}
