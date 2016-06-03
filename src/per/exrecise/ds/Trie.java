package per.exrecise.ds;

import java.util.LinkedList;
import java.util.List;

public class Trie {

	private TrieNode root = null;
	
	public Trie() {	
		root = new TrieNode();
	}
	
	private void add(TrieNode n, String s) {
		
		char first = s.charAt(0);
		
		List<TrieNode> list = n.getChildren();
		
		if (list != null) {
			for (TrieNode cn: list) {
				if (first == cn.getValue()) {
					processNode(cn, s);					
					return;
				}
			}	
		} else {
			list = new LinkedList<TrieNode>();
		}		
		
		n.setChildren(list);
		TrieNode cur = new TrieNode();
		cur.setValue(first);
		cur.setParent(n);
		list.add(cur);

		processNode(cur, s);
	}
	
	private void processNode(TrieNode n, String s) {
		if (s.length() > 1) {
			add(n, s.substring(1));					
		} else {
			n.setEndOfWorld(true);
		}
	}
	
	public void add(String s) {
		add(root, s);
	}

	
	public List<String> autoComplete(String s) {
		//System.out.println("root: " + root);
		
		List<String> result = new LinkedList<String>();
				
		depthFirstSearch(s, "", result, root);
		
		return result;
	}
	
	private void depthFirstSearch(String searchStr, String prefix, List<String> result, TrieNode n) {
		List<TrieNode> list = n.getChildren();
		if (list == null) {
			return;
		}
		
		for (TrieNode cn: list) {		
			String word = prefix + cn.getValue();
				if (cn.isEndOfWorld()) {					
					if (word.contains(searchStr))
						result.add(word);
				} 
				depthFirstSearch(searchStr, word, result, cn);
		}
	}
	

	public static void main(String[] args) {
		Trie t = new Trie();
		t.add("hello");
		t.add("he");
		t.add("hell");
		t.add("him");
		System.out.println("1: " + t.autoComplete("hello")); //rerturn: hello
		System.out.println("2: " + t.autoComplete("he")); //return: [he, hell, hello]
		System.out.println("3: " + t.autoComplete("hi")); //return: him

	}

}
