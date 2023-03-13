package homerparser;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class HomerNodeHeading {
	@SerializedName("_localizedContents")
	List<LocalizedTextContent> textContent;
}
