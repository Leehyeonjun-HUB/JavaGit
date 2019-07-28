package baemin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BaeminCustomerInfo {

	private String id;
	private NewInfo newinfo;
	private LastInfo lastinfo;
	private CustomerInfo customerinfo;
	private String grade;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 고객 아이디 : ");
		builder.append(id);
		builder.append("\n2. 고객 정보 : ");
		builder.append(customerinfo);
		builder.append("\n3. 새로운 주문 정보: ");
		builder.append(newinfo);
		builder.append("\n4. 지난 최근 주문 정보: ");
		builder.append(lastinfo);
		builder.append("\n5. 고객 등급: ");
		builder.append(grade);
		builder.append("\n");
		return builder.toString();
	}

}
