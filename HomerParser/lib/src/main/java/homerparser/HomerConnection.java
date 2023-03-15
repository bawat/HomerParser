package homerparser;

import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

public class HomerConnection {
	@SerializedName("_id") @Getter
	String id;
	@SerializedName("_from") @Getter
	String from;
	@SerializedName("_to") @Getter
	String to;
	
	public HomerNode to() {
		return HomerNode.allNodes.stream().filter(node -> node.id.equalsIgnoreCase(to)).findAny().orElse(null);
	}
}
