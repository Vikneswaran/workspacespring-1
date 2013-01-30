package br.com.camilolopes.manager;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ManagerTransationAccount {
	@Pointcut("execution(* *.sacar(..))")
	public void transacao(){}
	
	@Before("transacao()")
	public void saque(){
//		poderia logar a info no arquivo de log
		System.out.println("Transa��o de saque inicializada");
	}
	@AfterReturning("transacao()")
	public void retirada(){
		System.out.println("Transa��o de saque concluida com sucesso");
	}
	
	@Pointcut("execution(* *.depositar(..))")
	public void deposito(){}
	
	@Before("deposito()")
	public void depositar(){
		System.out.println("Transa��o de deposito iniciada");
	}
	
	@AfterReturning("deposito()")
	public void depositado(){
		System.out.println("deposito realizado com sucesso");
	}
}
