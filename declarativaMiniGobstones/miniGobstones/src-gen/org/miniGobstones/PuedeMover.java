/**
 */
package org.miniGobstones;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puede Mover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.miniGobstones.PuedeMover#getDir <em>Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.miniGobstones.MiniGobstonesPackage#getPuedeMover()
 * @model
 * @generated
 */
public interface PuedeMover extends Command, Booleans
{
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
   * @see org.miniGobstones.MiniGobstonesPackage#getPuedeMover_Dir()
   * @model
   * @generated
   */
  Direccion getDir();

  /**
   * Sets the value of the '{@link org.miniGobstones.PuedeMover#getDir <em>Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dir</em>' attribute.
   * @see org.miniGobstones.Direccion
   * @see #getDir()
   * @generated
   */
  void setDir(Direccion value);

} // PuedeMover
