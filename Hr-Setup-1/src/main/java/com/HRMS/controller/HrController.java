package com.HRMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.HRMS.model.Announcement;
import com.HRMS.model.Award;
import com.HRMS.model.Complaints;
import com.HRMS.model.Holidays;
import com.HRMS.model.Promotion;
import com.HRMS.model.Resignation;
import com.HRMS.model.Termination;
import com.HRMS.model.Transfer;
import com.HRMS.model.Trip;
import com.HRMS.model.Warning;
import com.HRMS.repository.AwardRepo;
import com.HRMS.service.HrService;

import jakarta.servlet.http.HttpSession;

@CrossOrigin(origins = "http://Localhost:8080")
/* @Controller */
@RestController
@RequestMapping("/api/hr")
public class HrController {

	@Autowired
	private HrService service;

	@GetMapping("/")
	public String Home(Model m) {

		List<Award> award = service.getAllAward();
		m.addAttribute("award", award);
		return "dashboard";
	}

	@GetMapping("/index")
	public String Homee(Model m) {

		List<Award> award = service.getAllAward();
		m.addAttribute("award", award);
		return "index";
	}
	// Award
	/*
	 * @GetMapping("/addaward") public String AddAwardForm() { return "AddAward"; }
	 */

	@PostMapping("/addaward")
	public Award createAward(@RequestBody Award award) {
		// System.out.println(e);
		service.AddAward(award);
		// session.setAttribute("msg","Award Add Sucessfully");
		return service.AddAward(award);
	}

	@GetMapping("/edit1/{id}")
	public Award editAward(@PathVariable int id, Model m) {
		Award e = service.getAwardBy(id);
		m.addAttribute("award", e);
		return service.get(id);
	}

	@PostMapping("/update1")
	public String updateAward(@ModelAttribute Award e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddAward(e);
		return "redirect:/";
	}

	@GetMapping("/delete1")
	public String deleteAward(@PathVariable int id, HttpSession session) {
		service.deleteAward(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}
	
	//
	/*
	 * @GetMapping("/addaward") public String AddAwardForm() { return "AddAward"; }
	 */

	@PostMapping("/addannouncement")
	public Announcement createAnnouncement(@RequestBody Announcement announcement) {
		// System.out.println(e);
		service.AddAnnouncement(announcement);
		// session.setAttribute("msg","Award Add Sucessfully");
		return service.AddAnnouncement(announcement);
	}

	@GetMapping("/edit/{id}")
	public Announcement editAnnouncement(@PathVariable int id, Model m) {
		Announcement e = service.getAnnouncementBy(id);
		m.addAttribute("announcement", e);
		return service.get1(id);
	}

	@PostMapping("/update")
	public String updateAnnouncement(@ModelAttribute Announcement e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddAnnouncement(e);
		return "redirect:/";
	}

	@GetMapping("/delete")
	public String deleteAnnouncement(@PathVariable int id, HttpSession session) {
		service.deleteAnnouncement(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}

	

	// Complaints
	
	@PostMapping("/addcomplaints")
	public Complaints createComplaints(@RequestBody Complaints complaints) {
		// System.out.println(e);
		service.AddComplaints(complaints);
		// session.setAttribute("msg","Award Add Sucessfully");
		return service.AddComplaints(complaints);
	}

	@GetMapping("/edit2/{id}")
	public Complaints editComplaints(@PathVariable int id, Model m) {
		Complaints e = service.getComplaintsBy(id);
		m.addAttribute("complaints", e);
		return service.get2(id);
	}

	@PostMapping("/update2")
	public String updateComplaints(@ModelAttribute Complaints e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddComplaints(e);
		return "redirect:/";
	}

	@GetMapping("/delete2")
	public String deleteComplaints(@PathVariable int id, HttpSession session) {
		service.deleteComplaints(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}
	
	
	// Holidays

	@PostMapping("/addholidays")
	public Holidays createHolidays(@RequestBody Holidays holidays) {
		// System.out.println(e);
		service.AddHolidays(holidays);
		// session.setAttribute("msg","Award Add Sucessfully");
		return service.AddHolidays(holidays);
	}

	@GetMapping("/edit3/{id}")
	public Holidays editHolidays(@PathVariable int id, Model m) {
		Holidays e = service.getHolidaysBy(id);
		m.addAttribute("complaints", e);
		return service.get3(id);
	}

	@PostMapping("/update3")
	public String updateHolidays(@ModelAttribute Holidays e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddHolidays(e);
		return "redirect:/";
	}

	@GetMapping("/delete3")
	public String deleteHolidays(@PathVariable int id, HttpSession session) {
		service.deleteHolidays(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}
	
	// Promotion

	@PostMapping("/addpromotion")
	public Promotion createPromotion(@RequestBody Promotion promotion) {
		// System.out.println(e);
		service.AddPromotion(promotion);
		// session.setAttribute("msg","Award Add Sucessfully");
		return service.AddPromotion(promotion);
	}

	@GetMapping("/edit4/{id}")
	public Promotion editPromotion(@PathVariable int id, Model m) {
		Promotion e = service.getPromotionBy(id);
		m.addAttribute("promotion", e);
		return service.get4(id);
	}

	@PostMapping("/update4")
	public String updatePromotion(@ModelAttribute Promotion e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddPromotion(e);
		return "redirect:/";
	}

	@GetMapping("/delete4")
	public String deletePromotion(@PathVariable int id, HttpSession session) {
		service.deletePromotion(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}

	// Resignation
	
	@PostMapping("/addresignation")
	public Resignation createResignation(@RequestBody Resignation resignation) {
		// System.out.println(e);
		service.AddResignation(resignation);
		// session.setAttribute("msg","Award Add Sucessfully");
		return service.AddResignation(resignation);
	}

	@GetMapping("/edit5/{id}")
	public Resignation editResignation(@PathVariable int id, Model m) {
		Resignation e = service.getResignationBy(id);
		m.addAttribute("resignation", e);
		return service.get5(id);
	}

	@PostMapping("/update5")
	public String updateResignation(@ModelAttribute Resignation e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddResignation(e);
		return "redirect:/";
	}

	@GetMapping("/delete5")
	public String deleteResignation(@PathVariable int id, HttpSession session) {
		service.deleteResignation(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}

	// Termination

	@PostMapping("/addtermination")
	public Termination createTermination(@RequestBody Termination termination) {
		// System.out.println(e);
		service.AddTermination(termination);
		// session.setAttribute("msg","Award Add Sucessfully");
		return service.AddTermination(termination);
	}

	@GetMapping("/edit6/{id}")
	public Termination editTermination(@PathVariable int id, Model m) {
		Termination e = service.getTerminationBy(id);
		m.addAttribute("termination", e);
		return service.get6(id);
	}

	@PostMapping("/update6")
	public String updateTermination(@ModelAttribute Termination e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddTermination(e);
		return "redirect:/";
	}

	@GetMapping("/delete6")
	public String deleteTermination(@PathVariable int id, HttpSession session) {
		service.deleteTermination(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}

	// Transfer

	@PostMapping("/addtransfer")
	public Transfer createTransfer(@RequestBody Transfer transfer) {
		// System.out.println(e);
		service.AddTransfer(transfer);
		// session.setAttribute("msg","Award Add Sucessfully");
		return service.AddTransfer(transfer);
	}

	@GetMapping("/edit7/{id}")
	public Transfer editTransfer(@PathVariable int id, Model m) {
		Transfer e = service.getTransferBy(id);
		m.addAttribute("transfer", e);
		return service.get7(id);
	}

	@PostMapping("/update7")
	public String updateTransfer(@ModelAttribute Transfer e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddTransfer(e);
		return "redirect:/";
	}

	@GetMapping("/delete7")
	public String deleteTransfer(@PathVariable int id, HttpSession session) {
		service.deleteTransfer(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}
	
	// Trip

	@GetMapping("/addtrip")
	public String AddTripForm() {
		return "AddTrip";
	}

	@PostMapping("/addtrip")
	public String createTrip(@ModelAttribute Trip e, HttpSession session) {
		// System.out.println(e);
		service.AddTrip(e);
		session.setAttribute("msg", "Trip Add Sucessfully");
		return "redirect:/";
	}

	@GetMapping("/edit8/{id}")
	public String editTrip(@PathVariable int id, Model m) {
		Trip e = service.getTripBy(id);
		m.addAttribute("trip", e);
		return "edit";
	}

	@PostMapping("/update8")
	public String updateTrip(@ModelAttribute Trip e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddTrip(e);
		return "redirect:/";
	}

	@GetMapping("/delete8")
	public String deleteTrip(@PathVariable int id, HttpSession session) {
		service.deleteTrip(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}

	// Warning

	@GetMapping("/addwarning")
	public String AddWarningForm() {
		return "AddWarning";
	}

	@PostMapping("/addwarning")
	public String createWarning(@ModelAttribute Warning e, HttpSession session) {
		// System.out.println(e);
		service.AddWarning(e);
		session.setAttribute("msg", "Warning Add Sucessfully");
		return "redirect:/";
	}

	@GetMapping("/edit9/{id}")
	public String editWarning(@PathVariable int id, Model m) {
		Warning e = service.getWarningBy(id);
		m.addAttribute("warning", e);
		return "edit";
	}

	@PostMapping("/update9")
	public String updateWarning(@ModelAttribute Warning e, HttpSession session) {
		session.setAttribute("msg", "Update sucessfully");
		service.AddWarning(e);
		return "redirect:/";
	}

	@GetMapping("/delete9")
	public String deleteWarning(@PathVariable int id, HttpSession session) {
		service.deleteWarning(id);
		session.setAttribute("msg", "Delete Sucessfully");
		return "redirect:/";
	}
}
