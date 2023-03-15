package homerparser;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

public class HomerSubElement {
	@SerializedName("_id") @Getter
	String id;
	@SerializedName("_type") @Getter
	String type;

	@SerializedName("_localizedContents") @Getter
	List<LocalizedTextContent> textContent;
}
