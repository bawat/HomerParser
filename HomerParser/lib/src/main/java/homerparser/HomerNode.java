package homerparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

public class HomerNode {
	public static List<HomerNode> allNodes = new ArrayList<HomerNode>();
	public static Optional<HomerNode> getNodeByID(String nodeID) {
		return HomerNode.allNodes.stream()
			.filter(node -> node.id == nodeID)
			.findAny();
	}
	{
		allNodes.add(this);
	}
	
	@SerializedName("_id") @Getter
	String id;
	@SerializedName("_type") @Getter
	String type;
	@SerializedName("_connections") @Getter
	List<HomerConnection> connections;
	@SerializedName("_elements") @Getter
	List<HomerSubElement> subElements;
	@SerializedName("_header") @Getter
	HomerNodeHeading heading;
	
	public boolean hasNextNode() {
		return connections.size() != 0;
	}
	public HomerNode getNextNode() {
		HomerConnection connection = connections.get(new Random().nextInt(connections.size()));
		return connection.to();
	}
	
	public String toString(){
		String str = type + ": " + System.lineSeparator();
		if(heading != null)
			str += heading.textContent.get(0).text + System.lineSeparator();
		for(HomerSubElement ele : subElements) {
			str += ele.textContent.get(0).text + System.lineSeparator();
		}
		return str;
	}

	public boolean isStartNode() {
		return "start".equalsIgnoreCase(type);
	}
}
