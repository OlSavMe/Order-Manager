package com.project.manager.web;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.manager.domain.ItemRepository;
import com.project.manager.domain.Torder;
import com.project.manager.domain.TorderRepository;
import com.project.manager.domain.UnitRepository;



@Controller
public class ManagerController {
	@Autowired
	private TorderRepository repository;
	
	@Autowired
	private ItemRepository itemrepository;
	
	@Autowired
	private UnitRepository unitrepository;
	
	 @RequestMapping(value="/login")
	    public String login() {	
	        return "login";
	    }
	
	
	@RequestMapping(value="/orderlist", method=RequestMethod.GET)
    public String torderList(Model model) {
    	model.addAttribute("orders", repository.findAll());
    	model.addAttribute("count", repository.count());
    	model.addAttribute("localDateTime", LocalDateTime.now());
        return "orderlist";
        
    }
	
	

	@RequestMapping(value="/orders", method = RequestMethod.GET)
	public @ResponseBody List<Torder> torderListRest() {
	return (List<Torder>) repository.findAll();
	
	}
	
	

    @RequestMapping(value="/order/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Torder> findTorderRest(@PathVariable("id") Long id) {	
    	return repository.findById(id);
    } 
	

	
	@RequestMapping(value = "/add")
	public String addOrder(Model model){
	model.addAttribute("order", new Torder());
	model.addAttribute("items", itemrepository.findAll());
	model.addAttribute("units", unitrepository.findAll());
	return "addorder";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Torder torder){
	repository.save(torder);
	return "redirect:orderlist";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteOrder(@PathVariable("id") Long id, Model model) {
	repository.deleteById(id);
	return "redirect:../orderlist";
	}
	
	
        
	
	@RequestMapping(value = "/edit/{id}")
	public String editOrder(@PathVariable("id") Long id, Model model){
	model.addAttribute("order", repository.findById(id));
	model.addAttribute("items", itemrepository.findAll());
	model.addAttribute("units", unitrepository.findAll());
	return "editorder";
	}
	
	
	

}
