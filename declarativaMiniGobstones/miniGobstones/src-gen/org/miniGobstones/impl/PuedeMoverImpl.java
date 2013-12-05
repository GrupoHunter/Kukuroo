/**
 */
package org.miniGobstones.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.miniGobstones.Booleans;
import org.miniGobstones.Direccion;
import org.miniGobstones.MiniGobstonesPackage;
import org.miniGobstones.PuedeMover;
import org.miniGobstones.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puede Mover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.miniGobstones.impl.PuedeMoverImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.miniGobstones.impl.PuedeMoverImpl#getDir <em>Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PuedeMoverImpl extends CommandImpl implements PuedeMover
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
   * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDir()
   * @generated
   * @ordered
   */
  protected static final Direccion DIR_EDEFAULT = Direccion.NORTE;

  /**
   * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDir()
   * @generated
   * @ordered
   */
  protected Direccion dir = DIR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PuedeMoverImpl()
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
    return MiniGobstonesPackage.Literals.PUEDE_MOVER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.PUEDE_MOVER__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direccion getDir()
  {
    return dir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDir(Direccion newDir)
  {
    Direccion oldDir = dir;
    dir = newDir == null ? DIR_EDEFAULT : newDir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.PUEDE_MOVER__DIR, oldDir, dir));
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
      case MiniGobstonesPackage.PUEDE_MOVER__VAR_NAME:
        return getVarName();
      case MiniGobstonesPackage.PUEDE_MOVER__DIR:
        return getDir();
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
      case MiniGobstonesPackage.PUEDE_MOVER__VAR_NAME:
        setVarName((String)newValue);
        return;
      case MiniGobstonesPackage.PUEDE_MOVER__DIR:
        setDir((Direccion)newValue);
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
      case MiniGobstonesPackage.PUEDE_MOVER__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
      case MiniGobstonesPackage.PUEDE_MOVER__DIR:
        setDir(DIR_EDEFAULT);
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
      case MiniGobstonesPackage.PUEDE_MOVER__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
      case MiniGobstonesPackage.PUEDE_MOVER__DIR:
        return dir != DIR_EDEFAULT;
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
        case MiniGobstonesPackage.PUEDE_MOVER__VAR_NAME: return MiniGobstonesPackage.VARIABLE__VAR_NAME;
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
        case MiniGobstonesPackage.VARIABLE__VAR_NAME: return MiniGobstonesPackage.PUEDE_MOVER__VAR_NAME;
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
    result.append(", dir: ");
    result.append(dir);
    result.append(')');
    return result.toString();
  }

} //PuedeMoverImpl
