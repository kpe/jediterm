package com.jediterm;

import com.google.common.base.Ascii;
import com.jediterm.terminal.TerminalKeyEncoder;
import junit.framework.TestCase;
import org.junit.Assert;

import java.awt.event.InputEvent;
import java.nio.charset.Charset;

/**
 * @author traff
 */
public class TerminalKeyEncoderTest extends TestCase {
  
  public void testAltBackspace() {
    TerminalKeyEncoder terminalKeyEncoder = new TerminalKeyEncoder();
    Assert.assertArrayEquals(new byte[]{Ascii.ESC, Ascii.DEL}, terminalKeyEncoder.getCode('\b', InputEvent.ALT_MASK));
  }

  public void testAltLeft() {
    TerminalKeyEncoder terminalKeyEncoder = new TerminalKeyEncoder();
    Assert.assertArrayEquals(new byte[]{Ascii.ESC, Ascii.ESC, '[', 'D'}, terminalKeyEncoder.getCode(37, InputEvent.ALT_MASK));
  }
}
