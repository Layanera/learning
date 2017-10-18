package de.stinkiproductions.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component("helloBean")
public class HelloWorld
{
	@Autowired
	private Printer printer;

	@Autowired
	private MessageSource msgSrc;

	public void printHello()
	{
		printer.print(msgSrc.getMessage("greeting", null, "Hi", LocaleContextHolder.getLocale()));
	}

	public Printer getPrinter()
	{
		return printer;
	}

	public void setPrinter(Printer printer)
	{
		this.printer = printer;
	}
}
