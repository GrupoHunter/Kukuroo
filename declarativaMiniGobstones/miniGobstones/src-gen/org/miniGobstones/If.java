/**
 */
package org.miniGobstones;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.miniGobstones.If#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.miniGobstones.If#getCommandsThen <em>Commands Then</em>}</li>
 *   <li>{@link org.miniGobstones.If#getCommandsElse <em>Commands Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.miniGobstones.MiniGobstonesPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Command
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see org.miniGobstones.MiniGobstonesPackage#getIf_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.miniGobstones.If#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Commands Then</b></em>' containment reference list.
   * The list contents are of type {@link org.miniGobstones.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands Then</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands Then</em>' containment reference list.
   * @see org.miniGobstones.MiniGobstonesPackage#getIf_CommandsThen()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommandsThen();

  /**
   * Returns the value of the '<em><b>Commands Else</b></em>' containment reference list.
   * The list contents are of type {@link org.miniGobstones.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands Else</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands Else</em>' containment reference list.
   * @see org.miniGobstones.MiniGobstonesPackage#getIf_CommandsElse()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommandsElse();

} // If
