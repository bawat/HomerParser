package homerparser;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

public class LocalizedTextContent {
	@SerializedName("_text") @Getter
	String text;
}
