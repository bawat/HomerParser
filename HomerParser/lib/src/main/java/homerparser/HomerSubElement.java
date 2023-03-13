package homerparser;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class HomerSubElement {
	@SerializedName("_id")
	String id;
	@SerializedName("_type")
	String type;

	@SerializedName("_localizedContents")
	List<LocalizedTextContent> textContent;
}
