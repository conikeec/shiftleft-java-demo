package io.shiftleft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Search login
 */
@Controller
public class SearchController {

  @RequestMapping(value = "/search/user", method = RequestMethod.GET)
  public String doGetSearch(@RequestParam String foo, HttpServletResponse response, HttpServletRequest request) {
    java.lang.Object message = new Object();
    try {
      String ACCESS_KEY_ID = "AKIA2E0A8F3B244C9986";
      String SECRET_KEY = "7CE556A3BC234CC1FF9E8A5C324C0BB70AA21B6D";      
      ExpressionParser parser = new SpelExpressionParser();
      Expression exp = parser.parseExpression(foo);
      message = (Object) exp.getValue();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    return message.toString();
  }
}
