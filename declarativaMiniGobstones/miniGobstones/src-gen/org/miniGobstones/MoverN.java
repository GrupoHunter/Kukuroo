/**
 */
package org.miniGobstones;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mover N</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.miniGobstones.MoverN#getInt <em>Int</em>}</li>
 *   <li>{@link org.miniGobstones.MoverN#getDir <em>Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.miniGobstones.MiniGobstonesPackage#getMoverN()
 * @model
 * @generated
 */
public interface MoverN extends Command
{
  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(int)
   * @see org.miniGobstones.MiniGobstonesPackage#getMoverN_Int()
   * @model
   * @generated
   */
  int getInt();

  /**
   * Sets the value of the '{@link org.miniGobstones.MoverN#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #getInt()
   * @generated
   */
  void setInt(int value);

  /**
   * Returns the value of the '<em><b>Dir</b></em>' attribute.
   * The literals are from the enumeration {@link org.miniGobstones.Direccion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dir</em>' attribute.
   * @see org.miniGobstones.Direccion
   * @see #setDir(Direccion)
   * @see org.miniGobstones.MiniGobstonesPackage#getMoverN_Dir()
   * @model
   * @generated
   */
  Direccion getDir();

  /**
   * Sets the value of the '{@link org.miniGobstones.MoverN#getDir <em>Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dir</em>' attribute.
   * @see org.miniGobstones.Direccion
   * @see #getDir()
   * @generated
   */
  void setDir(Direccion value);

} // MoverN
