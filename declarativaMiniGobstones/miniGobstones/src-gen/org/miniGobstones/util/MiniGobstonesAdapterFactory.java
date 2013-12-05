/**
 */
package org.miniGobstones.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.miniGobstones.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.miniGobstones.MiniGobstonesPackage
 * @generated
 */
public class MiniGobstonesAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MiniGobstonesPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniGobstonesAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MiniGobstonesPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MiniGobstonesSwitch<Adapter> modelSwitch =
    new MiniGobstonesSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter casePonerN(PonerN object)
      {
        return createPonerNAdapter();
      }
      @Override
      public Adapter caseMoverN(MoverN object)
      {
        return createMoverNAdapter();
      }
      @Override
      public Adapter casePoner(Poner object)
      {
        return createPonerAdapter();
      }
      @Override
      public Adapter caseMover(Mover object)
      {
        return createMoverAdapter();
      }
      @Override
      public Adapter caseHayBolitas(HayBolitas object)
      {
        return createHayBolitasAdapter();
      }
      @Override
      public Adapter casePuedeMover(PuedeMover object)
      {
        return createPuedeMoverAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseFor(For object)
      {
        return createForAdapter();
      }
      @Override
      public Adapter caseIf(If object)
      {
        return createIfAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseBooleans(Booleans object)
      {
        return createBooleansAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.Procedure
   * @generated
   */
  public Adapter createProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.PonerN <em>Poner N</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.PonerN
   * @generated
   */
  public Adapter createPonerNAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.MoverN <em>Mover N</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.MoverN
   * @generated
   */
  public Adapter createMoverNAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.Poner <em>Poner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.Poner
   * @generated
   */
  public Adapter createPonerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.Mover <em>Mover</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.Mover
   * @generated
   */
  public Adapter createMoverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.HayBolitas <em>Hay Bolitas</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.HayBolitas
   * @generated
   */
  public Adapter createHayBolitasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.PuedeMover <em>Puede Mover</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.PuedeMover
   * @generated
   */
  public Adapter createPuedeMoverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.For
   * @generated
   */
  public Adapter createForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.If
   * @generated
   */
  public Adapter createIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.Booleans <em>Booleans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.Booleans
   * @generated
   */
  public Adapter createBooleansAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.miniGobstones.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.miniGobstones.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MiniGobstonesAdapterFactory
