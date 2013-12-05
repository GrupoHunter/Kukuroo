/**
 */
package org.miniGobstones.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.miniGobstones.Color;
import org.miniGobstones.Command;
import org.miniGobstones.For;
import org.miniGobstones.MiniGobstonesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.miniGobstones.impl.ForImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.miniGobstones.impl.ForImpl#getColorA <em>Color A</em>}</li>
 *   <li>{@link org.miniGobstones.impl.ForImpl#getColorB <em>Color B</em>}</li>
 *   <li>{@link org.miniGobstones.impl.ForImpl#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForImpl extends CommandImpl implements For
{
  /**
   * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected static final String VAR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected String varName = VAR_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getColorA() <em>Color A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorA()
   * @generated
   * @ordered
   */
  protected static final Color COLOR_A_EDEFAULT = Color.VERDE;

  /**
   * The cached value of the '{@link #getColorA() <em>Color A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorA()
   * @generated
   * @ordered
   */
  protected Color colorA = COLOR_A_EDEFAULT;

  /**
   * The default value of the '{@link #getColorB() <em>Color B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorB()
   * @generated
   * @ordered
   */
  protected static final Color COLOR_B_EDEFAULT = Color.VERDE;

  /**
   * The cached value of the '{@link #getColorB() <em>Color B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorB()
   * @generated
   * @ordered
   */
  protected Color colorB = COLOR_B_EDEFAULT;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected EList<Command> command;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MiniGobstonesPackage.Literals.FOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarName()
  {
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarName(String newVarName)
  {
    String oldVarName = varName;
    varName = newVarName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.FOR__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColorA()
  {
    return colorA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColorA(Color newColorA)
  {
    Color oldColorA = colorA;
    colorA = newColorA == null ? COLOR_A_EDEFAULT : newColorA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.FOR__COLOR_A, oldColorA, colorA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColorB()
  {
    return colorB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColorB(Color newColorB)
  {
    Color oldColorB = colorB;
    colorB = newColorB == null ? COLOR_B_EDEFAULT : newColorB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.FOR__COLOR_B, oldColorB, colorB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommand()
  {
    if (command == null)
    {
      command = new EObjectContainmentEList<Command>(Command.class, this, MiniGobstonesPackage.FOR__COMMAND);
    }
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.FOR__COMMAND:
        return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.FOR__VAR_NAME:
        return getVarName();
      case MiniGobstonesPackage.FOR__COLOR_A:
        return getColorA();
      case MiniGobstonesPackage.FOR__COLOR_B:
        return getColorB();
      case MiniGobstonesPackage.FOR__COMMAND:
        return getCommand();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.FOR__VAR_NAME:
        setVarName((String)newValue);
        return;
      case MiniGobstonesPackage.FOR__COLOR_A:
        setColorA((Color)newValue);
        return;
      case MiniGobstonesPackage.FOR__COLOR_B:
        setColorB((Color)newValue);
        return;
      case MiniGobstonesPackage.FOR__COMMAND:
        getCommand().clear();
        getCommand().addAll((Collection<? extends Command>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.FOR__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
      case MiniGobstonesPackage.FOR__COLOR_A:
        setColorA(COLOR_A_EDEFAULT);
        return;
      case MiniGobstonesPackage.FOR__COLOR_B:
        setColorB(COLOR_B_EDEFAULT);
        return;
      case MiniGobstonesPackage.FOR__COMMAND:
        getCommand().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.FOR__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
      case MiniGobstonesPackage.FOR__COLOR_A:
        return colorA != COLOR_A_EDEFAULT;
      case MiniGobstonesPackage.FOR__COLOR_B:
        return colorB != COLOR_B_EDEFAULT;
      case MiniGobstonesPackage.FOR__COMMAND:
        return command != null && !command.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (varName: ");
    result.append(varName);
    result.append(", colorA: ");
    result.append(colorA);
    result.append(", colorB: ");
    result.append(colorB);
    result.append(')');
    return result.toString();
  }

} //ForImpl
