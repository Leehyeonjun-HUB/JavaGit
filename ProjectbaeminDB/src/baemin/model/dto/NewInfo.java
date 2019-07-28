package baemin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class NewInfo extends OrderInfo {

	private String demand;

	public NewInfo(String number, String place, String order, String location, String demand) {
		super(number, place, order, location);
		this.demand = demand;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", 요구사항 : ");
		builder.append(demand);
		builder.append("]");
		return builder.toString();
	}

}
