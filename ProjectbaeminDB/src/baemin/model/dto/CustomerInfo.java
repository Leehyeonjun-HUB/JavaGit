package baemin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerInfo {

	private String nickName;
	private String name;
	private String region;
	private int amount;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[∞Ì∞¥ ∫∞∏Ì : ");
		builder.append(nickName);
		builder.append(", ∞Ì∞¥ ¿Ã∏ß : ");
		builder.append(name);
		builder.append(", ∞Ì∞¥ ¡÷º“ : ");
		builder.append(region);
		builder.append(", ¡÷πÆ »Ωºˆ : ");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}

}
