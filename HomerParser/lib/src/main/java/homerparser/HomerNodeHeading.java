package homerparser;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

public class HomerNodeHeading {
	@SerializedName("_localizedContents") @Getter
	List<LocalizedTextContent> textContent;
}
