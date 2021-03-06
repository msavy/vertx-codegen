package io.vertx.codegen;

import io.vertx.codegen.doc.Doc;

/**
 * Describes a property of a {@link io.vertx.codegen.DataObjectModel data object model}.
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class PropertyInfo {

  final boolean declared;
  final String name;
  final Doc doc;
  final TypeInfo type;
  final String writerMethod;
  final String readerMethod;
  final boolean array;
  final boolean adder;
  final boolean jsonifiable;

  public PropertyInfo(boolean declared, String name, Doc doc, TypeInfo type, String writerMethod, String readerMethod,
                      boolean array, boolean adder, boolean jsonifiable) {
    this.declared = declared;
    this.name = name;
    this.doc = doc;
    this.type = type;
    this.writerMethod = writerMethod;
    this.readerMethod = readerMethod;
    this.array = array;
    this.adder = adder;
    this.jsonifiable = jsonifiable;
  }

  /**
   * @return true if the property is declared by the its data object, that means it does not override the same property
   *   from other data object ancestors
   */
  public boolean isDeclared() {
    return declared;
  }

  /**
   * @return the resolved documentation of this property
   */
  public Doc getDoc() {
    return doc;
  }

  /**
   * @return the property name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the property type
   */
  public TypeInfo getType() {
    return type;
  }

  /**
   * @return the name of the Java method that can read the state of this property on the data object.
   */
  public String getReaderMethod() {
    return readerMethod;
  }

  /**
   * @return the name of the Java method that will update the state of this property on the data object, the nature of the method
   * depends on the {@link #isAdder()} and {@link #isArray()} values.
   */
  public String getWriterMethod() {
    return writerMethod;
  }

  /**
   * @return true if the property is managed by a {@code java.util.List}
   */
  public boolean isArray() {
    return array;
  }

  /**
   * @return true if the property is using an adder
   */
  public boolean isAdder() {
    return adder;
  }

  /**
   * @return true if the property type can be converted to a Json type
   */
  public boolean isJsonifiable() {
    return jsonifiable;
  }
}
