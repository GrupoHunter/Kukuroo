/**
 */
package org.miniGobstones;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.miniGobstones.MiniGobstonesPackage
 * @generated
 */
public interface MiniGobstonesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MiniGobstonesFactory eINSTANCE = org.miniGobstones.impl.MiniGobstonesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure</em>'.
   * @generated
   */
  Procedure createProcedure();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Poner N</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poner N</em>'.
   * @generated
   */
  PonerN createPonerN();

  /**
   * Returns a new object of class '<em>Mover N</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mover N</em>'.
   * @generated
   */
  MoverN createMoverN();

  /**
   * Returns a new object of class '<em>Poner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poner</em>'.
   * @generated
   */
  Poner createPoner();

  /**
   * Returns a new object of class '<em>Mover</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mover</em>'.
   * @generated
   */
  Mover createMover();

  /**
   * Returns a new object of class '<em>Hay Bolitas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hay Bolitas</em>'.
   * @generated
   */
  HayBolitas createHayBolitas();

  /**
   * Returns a new object of class '<em>Puede Mover</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Puede Mover</em>'.
   * @generated
   */
  PuedeMover createPuedeMover();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>While</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While</em>'.
   * @generated
   */
  While createWhile();

  /**
   * Returns a new object of class '<em>For</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For</em>'.
   * @generated
   */
  For createFor();

  /**
   * Returns a new object of class '<em>If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If</em>'.
   * @generated
   */
  If createIf();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Booleans</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Booleans</em>'.
   * @generated
   */
  Booleans createBooleans();

  /**
   * Returns a new object of class '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator</em>'.
   * @generated
   */
  Operator createOperator();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MiniGobstonesPackage getMiniGobstonesPackage();

} //MiniGobstonesFactory
