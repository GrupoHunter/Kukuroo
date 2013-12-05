/**
 */
package org.miniGobstones;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.miniGobstones.For#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.miniGobstones.For#getColorA <em>Color A</em>}</li>
 *   <li>{@link org.miniGobstones.For#getColorB <em>Color B</em>}</li>
 *   <li>{@link org.miniGobstones.For#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.miniGobstones.MiniGobstonesPackage#getFor()
 * @model
 * @generated
 */
public interface For extends Command
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see org.miniGobstones.MiniGobstonesPackage#getFor_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link org.miniGobstones.For#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

  /**
   * Returns the value of the '<em><b>Color A</b></em>' attribute.
   * The literals are from the enumeration {@link org.miniGobstones.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color A</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color A</em>' attribute.
   * @see org.miniGobstones.Color
   * @see #setColorA(Color)
   * @see org.miniGobstones.MiniGobstonesPackage#getFor_ColorA()
   * @model
   * @generated
   */
  Color getColorA();

  /**
   * Sets the value of the '{@link org.miniGobstones.For#getColorA <em>Color A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color A</em>' attribute.
   * @see org.miniGobstones.Color
   * @see #getColorA()
   * @generated
   */
  void setColorA(Color value);

  /**
   * Returns the value of the '<em><b>Color B</b></em>' attribute.
   * The literals are from the enumeration {@link org.miniGobstones.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color B</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color B</em>' attribute.
   * @see org.miniGobstones.Color
   * @see #setColorB(Color)
   * @see org.miniGobstones.MiniGobstonesPackage#getFor_ColorB()
   * @model
   * @generated
   */
  Color getColorB();

  /**
   * Sets the value of the '{@link org.miniGobstones.For#getColorB <em>Color B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color B</em>' attribute.
   * @see org.miniGobstones.Color
   * @see #getColorB()
   * @generated
   */
  void setColorB(Color value);

  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference list.
   * The list contents are of type {@link org.miniGobstones.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference list.
   * @see org.miniGobstones.MiniGobstonesPackage#getFor_Command()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommand();

} // For
