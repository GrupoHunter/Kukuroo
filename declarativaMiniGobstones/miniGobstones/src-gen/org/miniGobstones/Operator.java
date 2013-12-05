/**
 */
package org.miniGobstones;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.miniGobstones.Operator#getOpNot <em>Op Not</em>}</li>
 *   <li>{@link org.miniGobstones.Operator#getLeft <em>Left</em>}</li>
 *   <li>{@link org.miniGobstones.Operator#getOp <em>Op</em>}</li>
 *   <li>{@link org.miniGobstones.Operator#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.miniGobstones.MiniGobstonesPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends Expression
{
  /**
   * Returns the value of the '<em><b>Op Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Not</em>' attribute.
   * @see #setOpNot(String)
   * @see org.miniGobstones.MiniGobstonesPackage#getOperator_OpNot()
   * @model
   * @generated
   */
  String getOpNot();

  /**
   * Sets the value of the '{@link org.miniGobstones.Operator#getOpNot <em>Op Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Not</em>' attribute.
   * @see #getOpNot()
   * @generated
   */
  void setOpNot(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.miniGobstones.MiniGobstonesPackage#getOperator_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.miniGobstones.Operator#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.miniGobstones.MiniGobstonesPackage#getOperator_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.miniGobstones.Operator#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.miniGobstones.MiniGobstonesPackage#getOperator_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.miniGobstones.Operator#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Operator
