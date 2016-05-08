package per.ds.trie;

import java.util.List;

public class TrieNode {

	private char value;
	
	private TrieNode parent;
	
	private boolean endOfWorld;
	
	private List<TrieNode> children;

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public TrieNode getParent() {
		return parent;
	}

	public void setParent(TrieNode parent) {
		this.parent = parent;
	}

	public List<TrieNode> getChildren() {
		return children;
	}

	public void setChildren(List<TrieNode> children) {
		this.children = children;
	}
	
	public boolean isEndOfWorld() {
		return endOfWorld;
	}

	public void setEndOfWorld(boolean endOfWorld) {
		this.endOfWorld = endOfWorld;
	}

	@Override
	public String toString() {
		return "value: " + value + " endOfWorld=" + endOfWorld + "\n children: " + children;
	}
	
	
}
