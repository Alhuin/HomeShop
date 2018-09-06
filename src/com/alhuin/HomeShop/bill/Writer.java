package com.alhuin.HomeShop.bill;

public interface Writer {
    /**
     * Start writing process
     */
    void start();

    /**
     * Write a given line
     *
     * @param line the given line
     */
    void writeLine(String line);

    /**
     * Stop writing process
     */
    void stop();
}
