/**
 */
package org.miniGobstones;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.miniGobstones.MiniGobstonesFactory
 * @model kind="package"
 * @generated
 */
public interface MiniGobstonesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "miniGobstones";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.MiniGobstones.org";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "miniGobstones";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MiniGobstonesPackage eINSTANCE = org.miniGobstones.impl.MiniGobstonesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.ModelImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAIN = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.ProcedureImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__COMMANDS = 1;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.CommandImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 2;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.PonerNImpl <em>Poner N</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.PonerNImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getPonerN()
   * @generated
   */
  int PONER_N = 3;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PONER_N__INT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PONER_N__COLOR = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Poner N</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PONER_N_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.MoverNImpl <em>Mover N</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.MoverNImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getMoverN()
   * @generated
   */
  int MOVER_N = 4;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_N__INT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_N__DIR = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mover N</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_N_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.PonerImpl <em>Poner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.PonerImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getPoner()
   * @generated
   */
  int PONER = 5;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PONER__COLOR = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Poner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PONER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.MoverImpl <em>Mover</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.MoverImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getMover()
   * @generated
   */
  int MOVER = 6;

  /**
   * The feature id for the '<em><b>Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER__DIR = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mover</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.HayBolitasImpl <em>Hay Bolitas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.HayBolitasImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getHayBolitas()
   * @generated
   */
  int HAY_BOLITAS = 7;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAY_BOLITAS__COLOR = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hay Bolitas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAY_BOLITAS_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.PuedeMoverImpl <em>Puede Mover</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.PuedeMoverImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getPuedeMover()
   * @generated
   */
  int PUEDE_MOVER = 8;

  /**
   * The feature id for the '<em><b>Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUEDE_MOVER__DIR = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Puede Mover</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUEDE_MOVER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.IfImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getIf()
   * @generated
   */
  int IF = 9;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__EXPR = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Commands Then</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__COMMANDS_THEN = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Commands Else</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__COMMANDS_ELSE = COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.miniGobstones.impl.BooleansImpl <em>Booleans</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.impl.BooleansImpl
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getBooleans()
   * @generated
   */
  int BOOLEANS = 10;

  /**
   * The number of structural features of the '<em>Booleans</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEANS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.miniGobstones.Color <em>Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.Color
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getColor()
   * @generated
   */
  int COLOR = 11;

  /**
   * The meta object id for the '{@link org.miniGobstones.Direccion <em>Direccion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.miniGobstones.Direccion
   * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getDireccion()
   * @generated
   */
  int DIRECCION = 12;


  /**
   * Returns the meta object for class '{@link org.miniGobstones.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.miniGobstones.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.miniGobstones.Model#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see org.miniGobstones.Model#getMain()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Main();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see org.miniGobstones.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link org.miniGobstones.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.miniGobstones.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.miniGobstones.Procedure#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.miniGobstones.Procedure#getCommands()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Commands();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.miniGobstones.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.PonerN <em>Poner N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poner N</em>'.
   * @see org.miniGobstones.PonerN
   * @generated
   */
  EClass getPonerN();

  /**
   * Returns the meta object for the attribute '{@link org.miniGobstones.PonerN#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.miniGobstones.PonerN#getInt()
   * @see #getPonerN()
   * @generated
   */
  EAttribute getPonerN_Int();

  /**
   * Returns the meta object for the attribute '{@link org.miniGobstones.PonerN#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.miniGobstones.PonerN#getColor()
   * @see #getPonerN()
   * @generated
   */
  EAttribute getPonerN_Color();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.MoverN <em>Mover N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mover N</em>'.
   * @see org.miniGobstones.MoverN
   * @generated
   */
  EClass getMoverN();

  /**
   * Returns the meta object for the attribute '{@link org.miniGobstones.MoverN#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.miniGobstones.MoverN#getInt()
   * @see #getMoverN()
   * @generated
   */
  EAttribute getMoverN_Int();

  /**
   * Returns the meta object for the attribute '{@link org.miniGobstones.MoverN#getDir <em>Dir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dir</em>'.
   * @see org.miniGobstones.MoverN#getDir()
   * @see #getMoverN()
   * @generated
   */
  EAttribute getMoverN_Dir();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.Poner <em>Poner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poner</em>'.
   * @see org.miniGobstones.Poner
   * @generated
   */
  EClass getPoner();

  /**
   * Returns the meta object for the attribute '{@link org.miniGobstones.Poner#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.miniGobstones.Poner#getColor()
   * @see #getPoner()
   * @generated
   */
  EAttribute getPoner_Color();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.Mover <em>Mover</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mover</em>'.
   * @see org.miniGobstones.Mover
   * @generated
   */
  EClass getMover();

  /**
   * Returns the meta object for the attribute '{@link org.miniGobstones.Mover#getDir <em>Dir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dir</em>'.
   * @see org.miniGobstones.Mover#getDir()
   * @see #getMover()
   * @generated
   */
  EAttribute getMover_Dir();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.HayBolitas <em>Hay Bolitas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hay Bolitas</em>'.
   * @see org.miniGobstones.HayBolitas
   * @generated
   */
  EClass getHayBolitas();

  /**
   * Returns the meta object for the attribute '{@link org.miniGobstones.HayBolitas#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.miniGobstones.HayBolitas#getColor()
   * @see #getHayBolitas()
   * @generated
   */
  EAttribute getHayBolitas_Color();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.PuedeMover <em>Puede Mover</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Puede Mover</em>'.
   * @see org.miniGobstones.PuedeMover
   * @generated
   */
  EClass getPuedeMover();

  /**
   * Returns the meta object for the attribute '{@link org.miniGobstones.PuedeMover#getDir <em>Dir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dir</em>'.
   * @see org.miniGobstones.PuedeMover#getDir()
   * @see #getPuedeMover()
   * @generated
   */
  EAttribute getPuedeMover_Dir();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see org.miniGobstones.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference '{@link org.miniGobstones.If#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.miniGobstones.If#getExpr()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link org.miniGobstones.If#getCommandsThen <em>Commands Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands Then</em>'.
   * @see org.miniGobstones.If#getCommandsThen()
   * @see #getIf()
   * @generated
   */
  EReference getIf_CommandsThen();

  /**
   * Returns the meta object for the containment reference list '{@link org.miniGobstones.If#getCommandsElse <em>Commands Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands Else</em>'.
   * @see org.miniGobstones.If#getCommandsElse()
   * @see #getIf()
   * @generated
   */
  EReference getIf_CommandsElse();

  /**
   * Returns the meta object for class '{@link org.miniGobstones.Booleans <em>Booleans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Booleans</em>'.
   * @see org.miniGobstones.Booleans
   * @generated
   */
  EClass getBooleans();

  /**
   * Returns the meta object for enum '{@link org.miniGobstones.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color</em>'.
   * @see org.miniGobstones.Color
   * @generated
   */
  EEnum getColor();

  /**
   * Returns the meta object for enum '{@link org.miniGobstones.Direccion <em>Direccion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Direccion</em>'.
   * @see org.miniGobstones.Direccion
   * @generated
   */
  EEnum getDireccion();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MiniGobstonesFactory getMiniGobstonesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.ModelImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAIN = eINSTANCE.getModel_Main();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.ProcedureImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__COMMANDS = eINSTANCE.getProcedure_Commands();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.CommandImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.PonerNImpl <em>Poner N</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.PonerNImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getPonerN()
     * @generated
     */
    EClass PONER_N = eINSTANCE.getPonerN();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PONER_N__INT = eINSTANCE.getPonerN_Int();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PONER_N__COLOR = eINSTANCE.getPonerN_Color();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.MoverNImpl <em>Mover N</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.MoverNImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getMoverN()
     * @generated
     */
    EClass MOVER_N = eINSTANCE.getMoverN();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVER_N__INT = eINSTANCE.getMoverN_Int();

    /**
     * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVER_N__DIR = eINSTANCE.getMoverN_Dir();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.PonerImpl <em>Poner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.PonerImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getPoner()
     * @generated
     */
    EClass PONER = eINSTANCE.getPoner();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PONER__COLOR = eINSTANCE.getPoner_Color();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.MoverImpl <em>Mover</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.MoverImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getMover()
     * @generated
     */
    EClass MOVER = eINSTANCE.getMover();

    /**
     * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVER__DIR = eINSTANCE.getMover_Dir();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.HayBolitasImpl <em>Hay Bolitas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.HayBolitasImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getHayBolitas()
     * @generated
     */
    EClass HAY_BOLITAS = eINSTANCE.getHayBolitas();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAY_BOLITAS__COLOR = eINSTANCE.getHayBolitas_Color();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.PuedeMoverImpl <em>Puede Mover</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.PuedeMoverImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getPuedeMover()
     * @generated
     */
    EClass PUEDE_MOVER = eINSTANCE.getPuedeMover();

    /**
     * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUEDE_MOVER__DIR = eINSTANCE.getPuedeMover_Dir();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.IfImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__EXPR = eINSTANCE.getIf_Expr();

    /**
     * The meta object literal for the '<em><b>Commands Then</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__COMMANDS_THEN = eINSTANCE.getIf_CommandsThen();

    /**
     * The meta object literal for the '<em><b>Commands Else</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__COMMANDS_ELSE = eINSTANCE.getIf_CommandsElse();

    /**
     * The meta object literal for the '{@link org.miniGobstones.impl.BooleansImpl <em>Booleans</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.impl.BooleansImpl
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getBooleans()
     * @generated
     */
    EClass BOOLEANS = eINSTANCE.getBooleans();

    /**
     * The meta object literal for the '{@link org.miniGobstones.Color <em>Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.Color
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getColor()
     * @generated
     */
    EEnum COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '{@link org.miniGobstones.Direccion <em>Direccion</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.miniGobstones.Direccion
     * @see org.miniGobstones.impl.MiniGobstonesPackageImpl#getDireccion()
     * @generated
     */
    EEnum DIRECCION = eINSTANCE.getDireccion();

  }

} //MiniGobstonesPackage
