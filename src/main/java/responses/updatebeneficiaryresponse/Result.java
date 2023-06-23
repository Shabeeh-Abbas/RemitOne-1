package responses.updatebeneficiaryresponse;

import javax.xml.bind.annotation.XmlRootElement;


public class Result {
	 
	private Beneficiary beneficiary;
	
     public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

	
}
