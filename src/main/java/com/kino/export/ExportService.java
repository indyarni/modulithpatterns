package com.kino.export;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExportService {

    @Autowired
    List<ExportPlugin> exportPlugins;

    public String export(Long kundeId) {
        return exportPlugins.stream()
                .map(plugin -> plugin.export(kundeId))
                .collect(Collectors.joining(","));
    }
}
