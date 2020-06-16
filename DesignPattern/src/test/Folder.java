package test;

import java.util.List;
import java.util.ArrayList;

public class Folder extends Component{
	
	public Folder(String name) {
		super(name);
	}
	
	List<Component> children = new ArrayList<>();
	
	public boolean addComponent(Component compnent){
		return children.add(compnent);
	}
	
	public boolean removeComponent(Component compnent){
		return children.remove(compnent);
	}

	public List<Component> getChildren() {
		return children;
	}

}
