package CSharp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.OldNewCompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Simple_embedded_statement_20_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_kgou7v_a(editorContext, node);
  }
  private EditorCell createCollection_kgou7v_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_kgou7v_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_kgou7v_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_kgou7v_b0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_kgou7v_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "unsafe");
    editorCell.setCellId("Constant_kgou7v_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_kgou7v_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Simple_embedded_statement_20_Editor.Block_1SingleRoleHandler_kgou7v_b0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70acL, 0x70aadf795f73cdL, "Block_1"), editorContext);
    return provider.createCell();
  }
  private class Block_1SingleRoleHandler_kgou7v_b0 extends SingleRoleCellProvider {
    public Block_1SingleRoleHandler_kgou7v_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70acL, 0x70aadf795f73cdL, "Block_1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Block_1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_kgou7v_a1a(editorContext, node);
    }
    private EditorCell createConstant_kgou7v_a1a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_kgou7v_a1a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
}