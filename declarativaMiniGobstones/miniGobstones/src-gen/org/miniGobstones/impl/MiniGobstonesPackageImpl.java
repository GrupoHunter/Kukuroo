/**
 */
package org.miniGobstones.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.miniGobstones.Booleans;
import org.miniGobstones.Color;
import org.miniGobstones.Command;
import org.miniGobstones.Direccion;
import org.miniGobstones.Expression;
import org.miniGobstones.For;
import org.miniGobstones.HayBolitas;
import org.miniGobstones.If;
import org.miniGobstones.MiniGobstonesFactory;
import org.miniGobstones.MiniGobstonesPackage;
import org.miniGobstones.Model;
import org.miniGobstones.Mover;
import org.miniGobstones.MoverN;
import org.miniGobstones.Operator;
import org.miniGobstones.Poner;
import org.miniGobstones.PonerN;
import org.miniGobstones.Procedure;
import org.miniGobstones.PuedeMover;
import org.miniGobstones.Variable;
import org.miniGobstones.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniGobstonesPackageImpl extends EPackageImpl implements MiniGobstonesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ponerNEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moverNEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ponerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hayBolitasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass puedeMoverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleansEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum direccionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.miniGobstones.MiniGobstonesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MiniGobstonesPackageImpl()
  {
    super(eNS_URI, MiniGobstonesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MiniGobstonesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MiniGobstonesPackage init()
  {
    if (isInited) return (MiniGobstonesPackage)EPackage.Registry.INSTANCE.getEPackage(MiniGobstonesPackage.eNS_URI);

    // Obtain or create and register package
    MiniGobstonesPackageImpl theMiniGobstonesPackage = (MiniGobstonesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MiniGobstonesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MiniGobstonesPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMiniGobstonesPackage.createPackageContents();

    // Initialize created meta-data
    theMiniGobstonesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMiniGobstonesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MiniGobstonesPackage.eNS_URI, theMiniGobstonesPackage);
    return theMiniGobstonesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Main()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedure()
  {
    return procedureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedure_Name()
  {
    return (EAttribute)procedureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Commands()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPonerN()
  {
    return ponerNEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPonerN_Int()
  {
    return (EAttribute)ponerNEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPonerN_Color()
  {
    return (EAttribute)ponerNEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoverN()
  {
    return moverNEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMoverN_Int()
  {
    return (EAttribute)moverNEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMoverN_Dir()
  {
    return (EAttribute)moverNEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoner()
  {
    return ponerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoner_Color()
  {
    return (EAttribute)ponerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMover()
  {
    return moverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMover_Dir()
  {
    return (EAttribute)moverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHayBolitas()
  {
    return hayBolitasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHayBolitas_Color()
  {
    return (EAttribute)hayBolitasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPuedeMover()
  {
    return puedeMoverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPuedeMover_Dir()
  {
    return (EAttribute)puedeMoverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_VarName()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhile()
  {
    return whileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Expr()
  {
    return (EReference)whileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Commands()
  {
    return (EReference)whileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor()
  {
    return forEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_VarName()
  {
    return (EAttribute)forEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_ColorA()
  {
    return (EAttribute)forEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_ColorB()
  {
    return (EAttribute)forEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Command()
  {
    return (EReference)forEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIf()
  {
    return ifEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_Expr()
  {
    return (EReference)ifEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_CommandsThen()
  {
    return (EReference)ifEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_CommandsElse()
  {
    return (EReference)ifEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Expr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleans()
  {
    return booleansEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_OpNot()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_Left()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_Op()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_Right()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColor()
  {
    return colorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDireccion()
  {
    return direccionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniGobstonesFactory getMiniGobstonesFactory()
  {
    return (MiniGobstonesFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MAIN);

    procedureEClass = createEClass(PROCEDURE);
    createEAttribute(procedureEClass, PROCEDURE__NAME);
    createEReference(procedureEClass, PROCEDURE__COMMANDS);

    commandEClass = createEClass(COMMAND);

    ponerNEClass = createEClass(PONER_N);
    createEAttribute(ponerNEClass, PONER_N__INT);
    createEAttribute(ponerNEClass, PONER_N__COLOR);

    moverNEClass = createEClass(MOVER_N);
    createEAttribute(moverNEClass, MOVER_N__INT);
    createEAttribute(moverNEClass, MOVER_N__DIR);

    ponerEClass = createEClass(PONER);
    createEAttribute(ponerEClass, PONER__COLOR);

    moverEClass = createEClass(MOVER);
    createEAttribute(moverEClass, MOVER__DIR);

    hayBolitasEClass = createEClass(HAY_BOLITAS);
    createEAttribute(hayBolitasEClass, HAY_BOLITAS__COLOR);

    puedeMoverEClass = createEClass(PUEDE_MOVER);
    createEAttribute(puedeMoverEClass, PUEDE_MOVER__DIR);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__VAR_NAME);

    whileEClass = createEClass(WHILE);
    createEReference(whileEClass, WHILE__EXPR);
    createEReference(whileEClass, WHILE__COMMANDS);

    forEClass = createEClass(FOR);
    createEAttribute(forEClass, FOR__VAR_NAME);
    createEAttribute(forEClass, FOR__COLOR_A);
    createEAttribute(forEClass, FOR__COLOR_B);
    createEReference(forEClass, FOR__COMMAND);

    ifEClass = createEClass(IF);
    createEReference(ifEClass, IF__EXPR);
    createEReference(ifEClass, IF__COMMANDS_THEN);
    createEReference(ifEClass, IF__COMMANDS_ELSE);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__EXPR);

    booleansEClass = createEClass(BOOLEANS);

    operatorEClass = createEClass(OPERATOR);
    createEAttribute(operatorEClass, OPERATOR__OP_NOT);
    createEReference(operatorEClass, OPERATOR__LEFT);
    createEAttribute(operatorEClass, OPERATOR__OP);
    createEReference(operatorEClass, OPERATOR__RIGHT);

    // Create enums
    colorEEnum = createEEnum(COLOR);
    direccionEEnum = createEEnum(DIRECCION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ponerNEClass.getESuperTypes().add(this.getCommand());
    moverNEClass.getESuperTypes().add(this.getCommand());
    ponerEClass.getESuperTypes().add(this.getCommand());
    moverEClass.getESuperTypes().add(this.getCommand());
    hayBolitasEClass.getESuperTypes().add(this.getCommand());
    hayBolitasEClass.getESuperTypes().add(this.getBooleans());
    puedeMoverEClass.getESuperTypes().add(this.getCommand());
    puedeMoverEClass.getESuperTypes().add(this.getBooleans());
    variableEClass.getESuperTypes().add(this.getCommand());
    whileEClass.getESuperTypes().add(this.getCommand());
    forEClass.getESuperTypes().add(this.getCommand());
    ifEClass.getESuperTypes().add(this.getCommand());
    expressionEClass.getESuperTypes().add(this.getVariable());
    booleansEClass.getESuperTypes().add(this.getVariable());
    operatorEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Main(), this.getProcedure(), null, "main", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Commands(), this.getCommand(), null, "commands", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ponerNEClass, PonerN.class, "PonerN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPonerN_Int(), ecorePackage.getEInt(), "int", null, 0, 1, PonerN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPonerN_Color(), this.getColor(), "color", null, 0, 1, PonerN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moverNEClass, MoverN.class, "MoverN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMoverN_Int(), ecorePackage.getEInt(), "int", null, 0, 1, MoverN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMoverN_Dir(), this.getDireccion(), "dir", null, 0, 1, MoverN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ponerEClass, Poner.class, "Poner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoner_Color(), this.getColor(), "color", null, 0, 1, Poner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moverEClass, Mover.class, "Mover", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMover_Dir(), this.getDireccion(), "dir", null, 0, 1, Mover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hayBolitasEClass, HayBolitas.class, "HayBolitas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHayBolitas_Color(), this.getColor(), "color", null, 0, 1, HayBolitas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(puedeMoverEClass, PuedeMover.class, "PuedeMover", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPuedeMover_Dir(), this.getDireccion(), "dir", null, 0, 1, PuedeMover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhile_Expr(), this.getExpression(), null, "expr", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhile_Commands(), this.getCommand(), null, "commands", null, 0, -1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forEClass, For.class, "For", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFor_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFor_ColorA(), this.getColor(), "colorA", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFor_ColorB(), this.getColor(), "colorB", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Command(), this.getCommand(), null, "Command", null, 0, -1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIf_Expr(), this.getExpression(), null, "expr", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_CommandsThen(), this.getCommand(), null, "commandsThen", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_CommandsElse(), this.getCommand(), null, "commandsElse", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Expr(), this.getBooleans(), null, "expr", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleansEClass, Booleans.class, "Booleans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperator_OpNot(), ecorePackage.getEString(), "opNot", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_Left(), this.getExpression(), null, "left", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperator_Op(), ecorePackage.getEString(), "op", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_Right(), this.getExpression(), null, "right", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(colorEEnum, Color.class, "Color");
    addEEnumLiteral(colorEEnum, Color.VERDE);
    addEEnumLiteral(colorEEnum, Color.ROJO);
    addEEnumLiteral(colorEEnum, Color.AZUL);
    addEEnumLiteral(colorEEnum, Color.NEGRO);

    initEEnum(direccionEEnum, Direccion.class, "Direccion");
    addEEnumLiteral(direccionEEnum, Direccion.NORTE);
    addEEnumLiteral(direccionEEnum, Direccion.SUR);
    addEEnumLiteral(direccionEEnum, Direccion.ESTE);
    addEEnumLiteral(direccionEEnum, Direccion.OESTE);

    // Create resource
    createResource(eNS_URI);
  }

} //MiniGobstonesPackageImpl
