/*
package org.academiadecodigo.spermmatchbank.authentication;

import org.academiadecodigo.spermmatchbank.converters.Convertor;
import org.academiadecodigo.spermmatchbank.dtos.DtoConsumer;
import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.academiadecodigo.spermmatchbank.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
@Controller
//@RequestMapping("")
public class ControllerAuthentication {

    private ConsumerService consumerService;

    @Autowired
    public void setConsumerService(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    public boolean isLogged(String username, String password){

        if(!User.getUserLists().containsKey(username)){
            return false;
        }

        return User.getUserLists().get(username).getPassword().equals(password);

    }

    @RequestMapping(method = RequestMethod.POST, path = {"/login"}*/
/*, params = "action=save"*//*
)
    public String checkLogin(@ModelAttribute("consumer") DtoConsumer dtoConsumer, HttpSession session) {

        Consumer consumer = Convertor.dtoConsumerToConsumer(dtoConsumer);

        boolean loggedIn = isLogged(consumer.getUsername(), consumer.getPassword());

        if (loggedIn) {
            session.setAttribute("username", consumer.getUsername());
        }


        return "redirect:/consumer/";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/register", ""}, params = "action=save")
    public String saveConsumer(@ModelAttribute("consumer") DtoConsumer dtoConsumer) {

        Consumer consumer = consumerService.save(Convertor.dtoConsumerToConsumer(dtoConsumer));

        consumer.setId(consumerService.listConsumers().size());


        return "redirect:/api/consumer/";
    }



}
*/
