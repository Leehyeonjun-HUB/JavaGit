package baemin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderInfo {

	private String number;
	private String place;
	private String order;
	private String location;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[번호 : ");
		builder.append(number);
		builder.append(", 주문내용 : ");
		builder.append(order);
		builder.append(", 주문지역 : ");
		builder.append(location);
		builder.append(", 배달업체 : ");
		builder.append(place);
		return builder.toString();
	}

}
