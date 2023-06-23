package dto;

public class CreateBeneficiaryDto implements Dto{
    private String username;
    private String password;
    private String pin;
	private String suspicion_reason;
    private String linked_member_id;
	private String name;
	private String local_name;
	private String fname;
	private String mname;
	private String lname;
	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String state;
	private String postcode;
	private String country;
	private String nationality;
	private String dob;
	private String gender;
	private String telephone;
	private String mobile;
	private String email;
	private String fathers_name;
	private String mothers_name;
	private String national_id_number;
	private String id_type;
	private String id_details;
	private String id_start;
	private String id_expiry;
	private String id_issued_by;
	private String id_issue_place;
	private String id_issue_country;
	private String id_scan;
	private String benef_employer_id_details;
	private String benef_taxpayer_reg;
	private String benef_occupation;
	private String card_type;
	private String card_number;
	private String account_number;
	private String bank;
	private String bank_branch;
	private String bank_branch_city;
	private String bank_branch_state;
	private String bank_branch_telephone;
	private String bank_branch_manager;
	private String benef_bank_swift_code;
	private String benef_bank_ifsc_code;
	private String benef_bank_iban;
	private String benef_bank_account_name;
	private String benef_ac_type;
	private String homedelivery_notes;
	private String enabled;
	private String suspicious;
	
	public String getSuspicion_reason() {
		return suspicion_reason;
	}
	public void setSuspicion_reason(String suspicion_reason) {
		this.suspicion_reason = suspicion_reason;
	}
	public String getLinked_member_id() {
		return linked_member_id;
	}
	public void setLinked_member_id(String linked_member_id) {
		this.linked_member_id = linked_member_id;
	}
	 public String getUsername() {
			return username;
	}
	public void setUsername(String username) {
			this.username = username;
	}
	public String getPassword() {
			return password;
	}
	public void setPassword(String password) {
			this.password = password;
	}
	public String getPin() {
			return pin;
	}
	public void setPin(String pin) {
			this.pin = pin;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocal_name() {
		return local_name;
	}
	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFathers_name() {
		return fathers_name;
	}
	public void setFathers_name(String fathers_name) {
		this.fathers_name = fathers_name;
	}
	public String getMothers_name() {
		return mothers_name;
	}
	public void setMothers_name(String mothers_name) {
		this.mothers_name = mothers_name;
	}
	public String getNational_id_number() {
		return national_id_number;
	}
	public void setNational_id_number(String national_id_number) {
		this.national_id_number = national_id_number;
	}
	public String getId_type() {
		return id_type;
	}
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	public String getId_details() {
		return id_details;
	}
	public void setId_details(String id_details) {
		this.id_details = id_details;
	}
	public String getId_start() {
		return id_start;
	}
	public void setId_start(String id_start) {
		this.id_start = id_start;
	}
	public String getId_expiry() {
		return id_expiry;
	}
	public void setId_expiry(String id_expiry) {
		this.id_expiry = id_expiry;
	}
	public String getId_issued_by() {
		return id_issued_by;
	}
	public void setId_issued_by(String id_issued_by) {
		this.id_issued_by = id_issued_by;
	}
	public String getId_issue_place() {
		return id_issue_place;
	}
	public void setId_issue_place(String id_issue_place) {
		this.id_issue_place = id_issue_place;
	}
	public String getId_issue_country() {
		return id_issue_country;
	}
	public void setId_issue_country(String id_issue_country) {
		this.id_issue_country = id_issue_country;
	}
	public String getId_scan() {
		return id_scan;
	}
	public void setId_scan(String id_scan) {
		this.id_scan = id_scan;
	}
	public String getBenef_employer_id_details() {
		return benef_employer_id_details;
	}
	public void setBenef_employer_id_details(String benef_employer_id_details) {
		this.benef_employer_id_details = benef_employer_id_details;
	}
	public String getBenef_taxpayer_reg() {
		return benef_taxpayer_reg;
	}
	public void setBenef_taxpayer_reg(String benef_taxpayer_reg) {
		this.benef_taxpayer_reg = benef_taxpayer_reg;
	}
	public String getBenef_occupation() {
		return benef_occupation;
	}
	public void setBenef_occupation(String benef_occupation) {
		this.benef_occupation = benef_occupation;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBank_branch() {
		return bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
	public String getBank_branch_city() {
		return bank_branch_city;
	}
	public void setBank_branch_city(String bank_branch_city) {
		this.bank_branch_city = bank_branch_city;
	}
	public String getBank_branch_state() {
		return bank_branch_state;
	}
	public void setBank_branch_state(String bank_branch_state) {
		this.bank_branch_state = bank_branch_state;
	}
	public String getBank_branch_telephone() {
		return bank_branch_telephone;
	}
	public void setBank_branch_telephone(String bank_branch_telephone) {
		this.bank_branch_telephone = bank_branch_telephone;
	}
	public String getBank_branch_manager() {
		return bank_branch_manager;
	}
	public void setBank_branch_manager(String bank_branch_manager) {
		this.bank_branch_manager = bank_branch_manager;
	}
	public String getBenef_bank_swift_code() {
		return benef_bank_swift_code;
	}
	public void setBenef_bank_swift_code(String benef_bank_swift_code) {
		this.benef_bank_swift_code = benef_bank_swift_code;
	}
	public String getBenef_bank_ifsc_code() {
		return benef_bank_ifsc_code;
	}
	public void setBenef_bank_ifsc_code(String benef_bank_ifsc_code) {
		this.benef_bank_ifsc_code = benef_bank_ifsc_code;
	}
	public String getBenef_bank_iban() {
		return benef_bank_iban;
	}
	public void setBenef_bank_iban(String benef_bank_iban) {
		this.benef_bank_iban = benef_bank_iban;
	}
	public String getBenef_bank_account_name() {
		return benef_bank_account_name;
	}
	public void setBenef_bank_account_name(String benef_bank_account_name) {
		this.benef_bank_account_name = benef_bank_account_name;
	}
	public String getBenef_ac_type() {
		return benef_ac_type;
	}
	public void setBenef_ac_type(String benef_ac_type) {
		this.benef_ac_type = benef_ac_type;
	}
	public String getHomedelivery_notes() {
		return homedelivery_notes;
	}
	public void setHomedelivery_notes(String homedelivery_notes) {
		this.homedelivery_notes = homedelivery_notes;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getSuspicious() {
		return suspicious;
	}
	public void setSuspicious(String suspicious) {
		this.suspicious = suspicious;
	}
	
}
