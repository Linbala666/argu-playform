package com.argu.playform.service;

import com.argu.playform.dto.trace.AddTraceNodeRequest;
import com.argu.playform.dto.trace.TraceNodeResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TraceService {

    public TraceNodeResponse addNode(AddTraceNodeRequest request) {
        return new TraceNodeResponse(
                request.batchNo(),
                request.actionName(),
                request.operator(),
                request.location(),
                request.imageUrl(),
                request.description(),
                LocalDateTime.now().toString()
        );
    }

    public List<TraceNodeResponse> detail(String batchNo) {
        return List.of(
                new TraceNodeResponse(batchNo, "农残检测", "王技术员", "检测中心", "http://example.com/report.jpg", "检测结果合格，无农药残留", LocalDateTime.now().minusDays(1).toString())
        );
    }
}
