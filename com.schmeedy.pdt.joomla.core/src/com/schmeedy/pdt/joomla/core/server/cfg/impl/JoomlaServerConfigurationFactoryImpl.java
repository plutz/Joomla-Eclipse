/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.schmeedy.pdt.joomla.core.server.cfg.impl;

import java.io.File;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.schmeedy.pdt.joomla.core.server.cfg.AvailableServers;
import com.schmeedy.pdt.joomla.core.server.cfg.DeploymentDescriptor;
import com.schmeedy.pdt.joomla.core.server.cfg.DeploymentRuntime;
import com.schmeedy.pdt.joomla.core.server.cfg.JoomlaExtensionDeployment;
import com.schmeedy.pdt.joomla.core.server.cfg.JoomlaServerConfigurationFactory;
import com.schmeedy.pdt.joomla.core.server.cfg.JoomlaServerConfigurationPackage;
import com.schmeedy.pdt.joomla.core.server.cfg.LocalJoomlaServer;
import com.schmeedy.pdt.joomla.core.server.cfg.MajorJoomlaVersion;
import com.schmeedy.pdt.joomla.core.server.cfg.UserCredentials;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoomlaServerConfigurationFactoryImpl extends EFactoryImpl implements JoomlaServerConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoomlaServerConfigurationFactory init() {
		try {
			JoomlaServerConfigurationFactory theJoomlaServerConfigurationFactory = (JoomlaServerConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://schmeedy.com/pdt/joomla/server"); 
			if (theJoomlaServerConfigurationFactory != null) {
				return theJoomlaServerConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoomlaServerConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaServerConfigurationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JoomlaServerConfigurationPackage.AVAILABLE_SERVERS: return createAvailableServers();
			case JoomlaServerConfigurationPackage.LOCAL_JOOMLA_SERVER: return createLocalJoomlaServer();
			case JoomlaServerConfigurationPackage.USER_CREDENTIALS: return createUserCredentials();
			case JoomlaServerConfigurationPackage.DEPLOYMENT_DESCRIPTOR: return createDeploymentDescriptor();
			case JoomlaServerConfigurationPackage.DEPLOYMENT_RUNTIME: return createDeploymentRuntime();
			case JoomlaServerConfigurationPackage.JOOMLA_EXTENSION_DEPLOYMENT: return createJoomlaExtensionDeployment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JoomlaServerConfigurationPackage.MAJOR_JOOMLA_VERSION:
				return createMajorJoomlaVersionFromString(eDataType, initialValue);
			case JoomlaServerConfigurationPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JoomlaServerConfigurationPackage.MAJOR_JOOMLA_VERSION:
				return convertMajorJoomlaVersionToString(eDataType, instanceValue);
			case JoomlaServerConfigurationPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailableServers createAvailableServers() {
		AvailableServersImpl availableServers = new AvailableServersImpl();
		return availableServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalJoomlaServer createLocalJoomlaServer() {
		LocalJoomlaServerImpl localJoomlaServer = new LocalJoomlaServerImpl();
		return localJoomlaServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserCredentials createUserCredentials() {
		UserCredentialsImpl userCredentials = new UserCredentialsImpl();
		return userCredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDescriptor createDeploymentDescriptor() {
		DeploymentDescriptorImpl deploymentDescriptor = new DeploymentDescriptorImpl();
		return deploymentDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentRuntime createDeploymentRuntime() {
		DeploymentRuntimeImpl deploymentRuntime = new DeploymentRuntimeImpl();
		return deploymentRuntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaExtensionDeployment createJoomlaExtensionDeployment() {
		JoomlaExtensionDeploymentImpl joomlaExtensionDeployment = new JoomlaExtensionDeploymentImpl();
		return joomlaExtensionDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajorJoomlaVersion createMajorJoomlaVersionFromString(EDataType eDataType, String initialValue) {
		MajorJoomlaVersion result = MajorJoomlaVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMajorJoomlaVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoomlaServerConfigurationPackage getJoomlaServerConfigurationPackage() {
		return (JoomlaServerConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JoomlaServerConfigurationPackage getPackage() {
		return JoomlaServerConfigurationPackage.eINSTANCE;
	}

} //JoomlaServerConfigurationFactoryImpl
