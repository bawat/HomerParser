package homerparser;

import java.util.Optional;

import com.google.gson.annotations.SerializedName;

public class HomerConnection {
	@SerializedName("_id")
	String id;
	@SerializedName("_from")
	String from;
	@SerializedName("_to")
	String to;
	
	public HomerNode to() {
		return HomerNode.allNodes.stream().filter(node -> node.id.equalsIgnoreCase(to)).findAny().orElse(null);
	}
}
