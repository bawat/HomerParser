package homerparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.gson.annotations.SerializedName;

public class HomerNode {
	public static List<HomerNode> allNodes = new ArrayList<HomerNode>();
	{
		allNodes.add(this);
	}
	
	@SerializedName("_id")
	String id;
	@SerializedName("_type")
	String type;
	@SerializedName("_connections")
	List<HomerConnection> connections;
	@SerializedName("_elements")
	List<HomerSubElement> subElements;
	@SerializedName("_header")
	HomerNodeHeading heading;
	
	boolean hasNextNode() {
		return connections.size() != 0;
	}
	HomerNode getNextNode() {
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
