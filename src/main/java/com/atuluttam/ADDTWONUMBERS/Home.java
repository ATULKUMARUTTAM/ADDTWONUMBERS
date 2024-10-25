package com.atuluttam.ADDTWONUMBERS;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {

 @RequestMapping("/sum")
 public String addtwonum()
 {
     return "calculator";
 }

@RequestMapping("/result")
 public String sum( @RequestParam("num1") Integer var1,@RequestParam("num2") Integer var2,  Model m)
 {
     m.addAttribute("num1", var1 );
     m.addAttribute("num2", var2 );
     m.addAttribute("sum", var1+var2);
     return  "result";
 }




}
