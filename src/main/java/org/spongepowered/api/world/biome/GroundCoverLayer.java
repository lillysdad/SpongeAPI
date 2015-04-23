/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.world.biome;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Objects;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.util.VariableAmount;

/**
 * Represents a layer of BlockStates specific to a biome which may be placed in
 * during generation.
 */
public class GroundCoverLayer {

    private BlockState block;
    private VariableAmount depth;

    /**
     * Creates a new {@link GroundCoverLayer}
     * 
     * @param block
     * @param depth
     */
    public GroundCoverLayer(BlockState block, VariableAmount depth) {
        this.block = checkNotNull(block, "block");
        this.depth = checkNotNull(depth, "depth");
    }

    /**
     * Gets the {@link BlockState} for this layer.
     * 
     * @return The block state
     */
    public BlockState getBlockState() {
        return this.block;
    }

    /**
     * Sets the {@link BlockState} for this layer.
     * 
     * @param block The block state
     */
    public void setBlockState(BlockState block) {
        this.block = checkNotNull(block, "block");
    }

    /**
     * Gets a representation of the depth of this layer.
     * 
     * @return The depth
     */
    public VariableAmount getDepth() {
        return this.depth;
    }

    /**
     * Sets the {@link VariableAmount} representing the depth of this layer.
     * 
     * @param depth The new variable amount
     */
    public void setDepth(VariableAmount depth) {
        this.depth = checkNotNull(depth, "depth");
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("block", this.block)
                .add("depth", this.depth)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroundCoverLayer object = (GroundCoverLayer) obj;
        if (!this.depth.equals(object.depth)) {
            return false;
        }
        if (!this.block.equals(object.block)) {
            return false;
        }
        return true;
    }
}
