package baemin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LastInfo extends OrderInfo {

	private String pay;

	public LastInfo(String number, String place, String order, String location, String pay) {
		super(number, place, order, location);
		this.pay = pay;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", 결제 방법 : ");
		builder.append(pay);
		builder.append("]");
		return builder.toString();
	}

}
