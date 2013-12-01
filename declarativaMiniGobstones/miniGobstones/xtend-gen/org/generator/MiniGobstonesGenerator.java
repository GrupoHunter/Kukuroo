package org.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.miniGobstones.Color;
import org.miniGobstones.Command;
import org.miniGobstones.Direccion;
import org.miniGobstones.Model;
import org.miniGobstones.Mover;
import org.miniGobstones.Poner;
import org.miniGobstones.Procedure;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class MiniGobstonesGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".java");
    CharSequence _javaCode = this.toJavaCode(resource);
    fsa.generateFile(_plus, _javaCode);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    String _substring = name.substring(0, _indexOf);
    return StringExtensions.toFirstUpper(_substring);
  }
  
  public CharSequence toJavaCode(final Resource res) {
    CharSequence _xblockexpression = null;
    {
      EList<EObject> _contents = res.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      Model model = ((Model) _head);
      CharSequence _javaCode = this.toJavaCode(model);
      _xblockexpression = (_javaCode);
    }
    return _xblockexpression;
  }
  
  public CharSequence toJavaCode(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package miniGobstones.main.");
    Resource _eResource = model.eResource();
    String _className = this.className(_eResource);
    _builder.append(_className, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("import enums.Color;");
    _builder.newLine();
    _builder.append("import enums.Direccion;\t\t\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    Resource _eResource_1 = model.eResource();
    String _className_1 = this.className(_eResource_1);
    String _firstUpper = StringExtensions.toFirstUpper(_className_1);
    _builder.append(_firstUpper, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {\t");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _compile = this.compile(model);
    _builder.append(_compile, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Procedure _main = model.getMain();
      EList<Command> _commands = _main.getCommands();
      for(final Command command : _commands) {
        String _compile = this.compile(command);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String compile(final Command command) {
    String _switchResult = null;
    EClass _eClass = command.eClass();
    String _name = _eClass.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"Poner")) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Cabezal.getInstance().poner(");
        Color _color = ((Poner) command).getColor();
        _builder.append(_color, "");
        _builder.append(");");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"Mover")) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Cabezal.getInstance().mover(");
        Direccion _dir = ((Mover) command).getDir();
        _builder_1.append(_dir, "");
        _builder_1.append(");");
        _switchResult = _builder_1.toString();
      }
    }
    if (!_matched) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _switchResult = _builder_2.toString();
    }
    return _switchResult;
  }
}
