package org.antlr.v4.test.tool;

import org.antlr.v4.gui.TreeTextProvider;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;

import java.util.Arrays;
import java.util.List;

public class InterpreterTreeTextProvider implements TreeTextProvider {
	public List<String> ruleNames;
	public InterpreterTreeTextProvider(String[] ruleNames) {this.ruleNames = Arrays.asList(ruleNames);}

	@Override
	public String getText(Tree node) {
		if ( node==null ) return "null";
		String nodeText = Trees.getNodeText(node, ruleNames);
		if ( node instanceof ErrorNode) {
			return "<error "+nodeText+">";
		}
		return nodeText;
	}
}
