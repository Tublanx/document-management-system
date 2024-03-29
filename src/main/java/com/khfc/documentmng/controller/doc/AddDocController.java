package com.khfc.documentmng.controller.doc;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khfc.documentmng.dto.DocumentDto;
import com.khfc.documentmng.service.doc.AddDocService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/main/addDoc")
public class AddDocController {

	private final AddDocService addDocService;

	@GetMapping
	public String addDocForm(Model model) {
		model.addAttribute("documentList", addDocService.selDocuments());
		return "doc/addDoc";
	}

	@RequestMapping(value = "/search.do")
	public String search(String docNo, String docName, LocalDate startDate, LocalDate endDate, Model model) {
		List<DocumentDto> searchList = addDocService.search(docNo, docName, startDate, endDate);
		
		model.addAttribute("searchList", searchList);

		return "doc-search";
	}

}
