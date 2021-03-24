package nl.jochem.app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.jochem.mock.ContactBusiness;
import nl.jochem.model.Contact;
 
@Controller
public class ContactController {
     
    @RequestMapping("/list_contact")
    public String listContact(Model model) {
         
        ContactBusiness business = new ContactBusiness();
        List<Contact> contactList = business.getContactList();
         
        model.addAttribute("contacts", contactList);       
         
        return "contact";
    }
}