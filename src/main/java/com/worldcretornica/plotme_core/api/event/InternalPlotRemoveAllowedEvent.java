package com.worldcretornica.plotme_core.api.event;

import com.worldcretornica.plotme_core.Plot;
import com.worldcretornica.plotme_core.PlotMe_Core;
import com.worldcretornica.plotme_core.api.IPlayer;
import com.worldcretornica.plotme_core.api.IWorld;

public class InternalPlotRemoveAllowedEvent extends InternalPlotEvent implements ICancellable {

    private boolean _canceled;
    private final IPlayer _player;
    private final String _removed;

    public InternalPlotRemoveAllowedEvent(PlotMe_Core instance, IWorld world, Plot plot, IPlayer player, String removed) {
        super(instance, plot, world);
        _player = player;
        _removed = removed;
    }

    @Override
    public boolean isCancelled() {
        return _canceled;
    }

    @Override
    public void setCanceled(boolean cancel) {
        _canceled = cancel;
    }

    public IPlayer getPlayer() {
        return _player;
    }

    public String getRemovedAllowed() {
        return _removed;
    }
}