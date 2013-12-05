/**
 */
package org.miniGobstones.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.miniGobstones.Booleans;
import org.miniGobstones.Color;
import org.miniGobstones.HayBolitas;
import org.miniGobstones.MiniGobstonesPackage;
import org.miniGobstones.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hay Bolitas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.miniGobstones.impl.HayBolitasImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.miniGobstones.impl.HayBolitasImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HayBolitasImpl extends CommandImpl implements HayBolitas
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
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final Color COLOR_EDEFAULT = Color.VERDE;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color = COLOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HayBolitasImpl()
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
    return MiniGobstonesPackage.Literals.HAY_BOLITAS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.HAY_BOLITAS__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    Color oldColor = color;
    color = newColor == null ? COLOR_EDEFAULT : newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.HAY_BOLITAS__COLOR, oldColor, color));
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
      case MiniGobstonesPackage.HAY_BOLITAS__VAR_NAME:
        return getVarName();
      case MiniGobstonesPackage.HAY_BOLITAS__COLOR:
        return getColor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.HAY_BOLITAS__VAR_NAME:
        setVarName((String)newValue);
        return;
      case MiniGobstonesPackage.HAY_BOLITAS__COLOR:
        setColor((Color)newValue);
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
      case MiniGobstonesPackage.HAY_BOLITAS__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
      case MiniGobstonesPackage.HAY_BOLITAS__COLOR:
        setColor(COLOR_EDEFAULT);
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
      case MiniGobstonesPackage.HAY_BOLITAS__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
      case MiniGobstonesPackage.HAY_BOLITAS__COLOR:
        return color != COLOR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Variable.class)
    {
      switch (derivedFeatureID)
      {
        case MiniGobstonesPackage.HAY_BOLITAS__VAR_NAME: return MiniGobstonesPackage.VARIABLE__VAR_NAME;
        default: return -1;
      }
    }
    if (baseClass == Booleans.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Variable.class)
    {
      switch (baseFeatureID)
      {
        case MiniGobstonesPackage.VARIABLE__VAR_NAME: return MiniGobstonesPackage.HAY_BOLITAS__VAR_NAME;
        default: return -1;
      }
    }
    if (baseClass == Booleans.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", color: ");
    result.append(color);
    result.append(')');
    return result.toString();
  }

} //HayBolitasImpl
