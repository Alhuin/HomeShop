package com.company.alhuin.HomeShop;

public interface Writer {
    /**
     * Start writing process
     */
    public void start();

    /**
     * Write a given line
     *
     * @param line the given line
     */
    public void writeLine(String line);

    /**
     * Stop writing process
     */
    public void stop();
}
