package at.git.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/polo")
public class Polo {

    private String marcoMessage = "Marco";


  //  @GetMapping()
   // String get(){
     //   return marcoMessage;
    //}

   // @GetMapping("/say")
   // String getMessage(String message){
     //   return message;
    //}

    @PostMapping()
    public String contact(@RequestBody String message){
        if (marcoMessage.equals(message)) {
            return "Polo";
        }
        return "What?";
    }


   /* @GetMapping("/message")
    public String contact(){
        return "just message";
    }
    */
}

