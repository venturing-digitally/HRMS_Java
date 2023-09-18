package com.HRMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.HRMS.repository.AnnouncementRepo;
import com.HRMS.repository.AwardRepo;
import com.HRMS.repository.ComplaintsRepo;
import com.HRMS.repository.HolidaysRepo;
import com.HRMS.repository.PromotionRepo;
import com.HRMS.repository.ResignationRepo;
import com.HRMS.repository.TerminationRepo;
import com.HRMS.repository.TransferRepo;
import com.HRMS.repository.TripRepo;
import com.HRMS.repository.WarningRepo;



@Service
public class HrService {

	@Autowired
	private AwardRepo repo1;
	
	@Autowired
	private AnnouncementRepo repo;
	
	@Autowired
	private ComplaintsRepo repo2;
	
	@Autowired
	private HolidaysRepo repo3;
	
	@Autowired
	private PromotionRepo repo4;
	
	@Autowired
	private ResignationRepo repo5;
	
	@Autowired
	private TerminationRepo repo6;
	
	@Autowired
	private TransferRepo repo7;
	
	@Autowired
	private TripRepo repo8;
	
	@Autowired
	private WarningRepo repo9;
	
	
	public HrService(AwardRepo repo1) {
		super();
		this.repo1 = repo1;
	}

	public Award AddAward(Award award) {
		return repo1.save(award);
	}

	public List<Award> getAllAward(){
		return repo1.findAll() ;
	}
	
	public Award getAwardBy(int id) {
		Optional<Award> e=repo1.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteAward(int id) {
		repo1.deleteById(id);
	}

	public Award get(int id) {
		return repo1.findById(id).get();
	}

//////

	@Autowired
	public HrService(AnnouncementRepo repo) {
	super();
	this.repo = repo;
}

	public Announcement AddAnnouncement(Announcement announcement) {
		return repo.save(announcement);
	}

	public List<Announcement> getAllAnnouncement(){
		return repo.findAll() ;
	}
	
	public Announcement getAnnouncementBy(int id) {
		Optional<Announcement> e=repo.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteAnnouncement(int id) {
		repo.deleteById(id);
	}

	public Announcement get1(int id) {
		return repo.findById(id).get();
	}

	
	//Complaints
	
	/* @Autowired */
	public HrService(ComplaintsRepo repo2) {
	super();
	this.repo2 = repo2;
     }

	public Complaints AddComplaints(Complaints complaints) {
		return repo2.save(complaints);
	}

	public List<Complaints> getAllComplaints(){
		return repo2.findAll() ;
	}
	
	public Complaints getComplaintsBy(int id) {
		Optional<Complaints> e=repo2.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteComplaints(int id) {
		repo.deleteById(id);
	}

	public Complaints get2(int id) {
		return repo2.findById(id).get();
	}
	
	//Holidays
	
	/* @Autowired */
	public HrService(HolidaysRepo repo3) {
	super();
	this.repo3 = repo3;
     }

	public Holidays AddHolidays(Holidays holidays) {
		return repo3.save(holidays);
	}

	public List<Holidays> getAllHolidays(){
		return repo3.findAll() ;
	}
	
	public Holidays getHolidaysBy(int id) {
		Optional<Holidays> e=repo3.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteHolidays(int id) {
		repo.deleteById(id);
	}

	public Holidays get3(int id) {
		return repo3.findById(id).get();
	}
	
	//Promotion
	
	/* @Autowired */
	public HrService(PromotionRepo repo4) {
	super();
	this.repo4 = repo4;
     }

	public Promotion AddPromotion(Promotion promotion) {
		return repo4.save(promotion);
	}

	public List<Promotion> getAllPromotion(){
		return repo4.findAll() ;
	}
	
	public Promotion getPromotionBy(int id) {
		Optional<Promotion> e=repo4.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deletePromotion(int id) {
		repo.deleteById(id);
	}

	public Promotion get4(int id) {
		return repo4.findById(id).get();
	}
	
	//Resignation
	
	/* @Autowired */
	public HrService(ResignationRepo repo5) {
	super();
	this.repo5 = repo5;
     }

	public Resignation AddResignation(Resignation resignation) {
		return repo5.save(resignation);
	}

	public List<Resignation> getAllResignation(){
		return repo5.findAll() ;
	}
	
	public Resignation getResignationBy(int id) {
		Optional<Resignation> e=repo5.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteResignation(int id) {
		repo.deleteById(id);
	}

	public Resignation get5(int id) {
		return repo5.findById(id).get();
	}
	
	//Termination
	
	/* @Autowired */
	public HrService(TerminationRepo repo6) {
	super();
	this.repo6 = repo6;
     }

	public Termination AddTermination(Termination termination) {
		return repo6.save(termination);
	}

	public List<Termination> getAllTermination(){
		return repo6.findAll() ;
	}
	
	public Termination getTerminationBy(int id) {
		Optional<Termination> e=repo6.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteTermination(int id) {
		repo.deleteById(id);
	}

	public Termination get6(int id) {
		return repo6.findById(id).get();
	}
	
	//Transfer
	
	/* @Autowired */
	public HrService(TransferRepo repo7) {
	super();
	this.repo7 = repo7;
     }

	public Transfer AddTransfer(Transfer transfer) {
		return repo7.save(transfer);
	}

	public List<Transfer> getAllTransfer(){
		return repo7.findAll() ;
	}
	
	public Transfer getTransferBy(int id) {
		Optional<Transfer> e=repo7.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteTransfer(int id) {
		repo.deleteById(id);
	}

	public Transfer get7(int id) {
		return repo7.findById(id).get();
	}
	
	
	//Trip
	public void AddTrip(Trip e) {
		repo8.save(e);
	}

	public List<Trip> getAllTrip(){
		return repo8.findAll() ;
	}
	
	public Trip getTripBy(int id) {
		Optional<Trip> e=repo8.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteTrip(int id) {
		repo8.deleteById(id);
	}

	public Trip getTrip(int id) {
		return repo8.findById(id).get();
	}
	
	//Warning
	
	public void AddWarning(Warning e) {
		repo9.save(e);
	}

	public List<Warning> getAllWarning(){
		return repo9.findAll() ;
	}
	
	public Warning getWarningBy(int id) {
		Optional<Warning> e=repo9.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteWarning(int id) {
		repo9.deleteById(id);
	}

	public Warning getWarning(int id) {
		return repo9.findById(id).get();
	}
}
